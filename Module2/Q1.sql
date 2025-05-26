

select e.title, e.start_date, e.end_date
from Events e
join Registrations r on e.event_id = r.event_id
join Users u on r.user_id = u.user_id
where e.status = 'upcoming' and u.city = 'Chennai' and e.city = u.city
order by e.start_date;

