
select e.title
from Events e
left join Feedback f on e.event_id = f.event_id
where f.feedback_id is null  and e.event_id in (select event_id from Registrations);