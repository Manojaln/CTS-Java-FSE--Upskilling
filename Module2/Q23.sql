
select month(registered_date) as month, count(registration_id) as registration_count
from Registrations
where registered_date >= DATE_SUB(CURRENT_DATE, interval 12 month)
group by MONTH(registration_date);