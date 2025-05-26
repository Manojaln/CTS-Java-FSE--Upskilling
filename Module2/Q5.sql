
select u.city, count(distinct r.user_id) as user_count
from Users u
join Registrations r on u.user_id = r.user_id
group by u.city
order by user_count DESC
limit 5;