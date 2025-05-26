document.addEventListener("DOMContentLoaded", () => {
  const registrationForm = document.getElementById("registrationForm");
  const confirmationMessage = document.getElementById("confirmationMessage");
  const feedback = document.getElementById("feedback");
  const eventType = document.getElementById("eventType");
  const eventFee = document.getElementById("eventFee");
  const eventVideo = document.getElementById("eventVideo");
  const videoStatus = document.getElementById("videoStatus");
  const clearPreferences = document.getElementById("clearPreferences");
  const registerSection = document.getElementById("register");
  const eventCards = document.querySelectorAll(".register_btn");

  // Show registration form when Register button is clicked
  eventCards.forEach(btn => {
    btn.addEventListener("click", (e) => {
      const selectedEvent = btn.getAttribute("data-event");
      registerSection.style.display = "block";
      window.location.hash = "#register";
      eventType.value = selectedEvent;
      // Optionally, scroll to the form
      registerSection.scrollIntoView({ behavior: "smooth" });
    });
  });

  // Hide registration form on page load
  registerSection.style.display = "none";


  // Local Storage - Save name, phone, and event type on submit
  registrationForm.addEventListener("submit", (e) => {
    e.preventDefault();

    const name = document.getElementById("name").value;
    const phone = document.getElementById("phone").value;
    const selectedEventType = eventType.value;
    const feedbackValue = feedback.value;

    localStorage.setItem("name", name);
    localStorage.setItem("phone", phone);
    localStorage.setItem("eventType", selectedEventType);
    localStorage.setItem("feedback", feedbackValue);

    confirmationMessage.textContent = `Thank you, ${name}! Your registration for the ${selectedEventType.charAt(0).toUpperCase() + selectedEventType.slice(1)} event is successful.`;
    registrationForm.reset();
    charCount.textContent = "0";
    eventFee.textContent = "Event Fee: ";
    //regisetrationForm hidden after registered
    registerSection.style.display = "none";
  });

  // Clear preferences
  clearPreferences.addEventListener("click", () => {
    localStorage.clear();
    alert("Local storage cleared.");
  });

  // Event fee calculator
  eventType.addEventListener("change", () => {
    let fee = 0;
    switch (eventType.value) {
      case "music": fee = 100; break;
      case "art": fee = 80; break;
      case "tech": fee = 150; break;
    }
    eventFee.textContent = fee ? `Event Fee: $${fee}` : "Event Fee: ";
  });

  // Video playback status
  eventVideo.addEventListener("play", () => {
    videoStatus.textContent = "Promo video is playing...";
  });
  eventVideo.addEventListener("pause", () => {
    videoStatus.textContent = "Promo video is paused.";
  });
});