select e.title, avg(f.rating) as average_rating
from Events e
join Feedback f on e.event_id = f.event_id
Group by e.event_id
having count(f.feedback_id) >= 10
order  by average_rating desc;