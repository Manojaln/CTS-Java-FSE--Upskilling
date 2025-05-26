
select u.name, COUNT(e.event_id) as event_count, e.status
from Users u
join Events e on u.user_id = e.organizer_id
group by u.user_id, e.status;