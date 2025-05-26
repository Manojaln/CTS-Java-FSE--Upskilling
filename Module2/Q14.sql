
select e.title, COUNT(r.registration_id) as registration_count
from Events e
join Registrations r ON e.event_id = r.event_id
group by e.event_id
oredr by registration_count DESC
limit 3;