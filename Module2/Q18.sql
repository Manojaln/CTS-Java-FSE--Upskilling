
select e.title
from Events e
left joinResources r on e.event_id = r.event_id
where r.resource_id IS NULL;