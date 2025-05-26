-- Insert data into Users table
insert into Users (name, email, city, registered_date) values
('Manoj', 'manoj@example.com', 'Chennai', '2024-10-01'),
('Martina', 'martina@example.com', 'Salem', '2024-10-09'),
('Monika', 'moni@example.com', 'Madurai', '2024-10-10'),
('Bindusri', 'sri@example.com', 'Chennai', '2024-10-15'),
('Kavitha', 'kavi@example.com', 'Vellore', '2024-11-01');

-- Insert data into Events table
insert into Events (title, desc, city, start_date, end_date, status, organizer_id) value
('Innovators Meetup', 'A meetup for tech enthusiasts.', 'Salem', '2025-01-10 10:00:00', '2025-06-10 16:00:00', 'upcoming', 1),
('AI Conference', 'Conference on AI advancements', 'Chennai', '2025-02-1 09:00:00', '2025-05-15 17:00:00', 'completed', 3),
('Java Bootcamp', 'Hands-on training on java.', 'Chennai', '2025-02-15 10:00:00', '2025-07-03 16:00:00', 'upcoming', 2);

-- Insert data into Sessions table
insert into Sessions (event_id, title, speaker_name, start_time, end_time) values
(1, 'Opening Keynotes, 'Dr.Roselin', '2025-06-10 10:00:00', '2025-06-10 11:00:00'),
(1, 'Intro to collections', 'Cathrine', '2025-06-10 11:15:00', '2025-06-10 12:30:00'),
(2, 'AI in Warfare', 'Pooja', '2025-05-15 09:30:00', '2025-05-15 11:00:00'),
(3, 'OOPs', 'Tharani', '2025-07-01 10:00:00', '2025-07-01 12:00:00');

-- Insert data into Registrations table
insert into Registrations (user_id, event_id, registered_date) values
(1, 1, '2025-05-01'),
(2, 1, '2025-05-02'),
(3, 2, '2025-04-30'),
(4, 2, '2025-04-28'),
(5, 3, '2025-06-15');

-- Insert data into Feedback table
insert into Feedback (user_id, event_id, rating, comments, feedback_date) values
(3, 2, 4, 'Good  message', '2025-05-16'),
(4, 2, 5, 'Informative.', '2025-05-16'),
(2, 1, 3, 'More interactive.', '2025-06-11');

-- Insert data into Resources table
insert into Resources (event_id, resource_type, resource_url, uploaded_at) values
(1, 'pdf', 'https://portal.com/resources/meetup.pdf', '2025-05-01 10:00:00'),
(2, 'image', 'https://portal.com/resources/poster.jpg', '2025-04-20 09:00:00'),
(3, 'link', 'https://portal.com/resources/java', '2025-06-25 15:00:00');
