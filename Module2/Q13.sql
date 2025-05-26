
select e.city, AVG(f.rating) as average_rating
from Events e
join Feedback f ON e.event_id = f.event_id
group by e.city;