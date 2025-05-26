
select u.name, f.comments, e.title
from Feedback f
join Users u on f.user_id = u.user_id
join Events e on f.event_id = e.event_id
where f.rating < 3;