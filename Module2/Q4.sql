
select e.title, count(s.session_id) as session_count
from Events e
join Sessions s on e.event_id = s.event_id
where hour(s.start_time) between 10 and 12
group by e.event_id;