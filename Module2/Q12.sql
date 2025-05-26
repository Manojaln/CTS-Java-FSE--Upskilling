
selct e.title, count(s.session_id) as session_count
from Events e
join Sessions s ON e.event_id = s.event_id
group by e.event_id
order by session_count desc
limit 1;