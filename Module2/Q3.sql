
select u.user_id, u.name
from Users u
Left join Registrations r on u.user_id = r.user_id
where r.registration_id is null  or r.registered_date < date_subs(current_date, interval 90 day);