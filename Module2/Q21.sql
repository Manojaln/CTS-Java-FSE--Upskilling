
select u.name, count(f.feedback_id) as feedback_count
from Users u
join Feedback f on u.user_id = f.user_id
group by u.user_id
order by feedback_count DESC
limit 5;