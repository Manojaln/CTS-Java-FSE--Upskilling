
select u.user_id, u.full_name, count(distinct r.event_id) as event_count, count(f.feedback_id) as feedback_count
from Users u
left join Registrations r ON u.user_id = r.user_id
left join  Feedback f ON u.user_id = f.user_id
group byu.user_id;