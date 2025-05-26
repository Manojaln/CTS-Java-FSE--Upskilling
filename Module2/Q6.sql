
select e.title, r.resource_type, count(r.resource_id) as resource_count
from Events e
join Resources r on e.event_id = r.event_id
group by e.event_id, r.resource_type;