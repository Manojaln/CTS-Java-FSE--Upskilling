
select registered_date, count(user_id) as user_count
from Users
where registered_date >= DATE_SUB(CURRENT_DATE, INTERVAL 7 DAY)
group by registered_date;