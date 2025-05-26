
select e.title, avg(TIMESTAMPDIFF(MINUTE, s.start_time, s.end_time)) as average_duration
from Events e
join Sessions s on e.event_id = s.event_id
group by e.event_id;