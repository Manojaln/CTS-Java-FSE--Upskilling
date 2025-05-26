
select e.title
from Events e
Left join Sessions s ON e.event_id = s.event_id
where s.session_id is null;