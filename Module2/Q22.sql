
select user_id, event_id, count(registration_id) as registration_count
from Registrations
Group by user_id, event_id
having registration_count > 1;