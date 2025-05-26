
select u.user_id, u.name
FROM Users u
left join Registrations r ON u.user_id = r.user_id
where r.registration_id is null and u.registered_date >= DATE_SUB(CURRENT_DATE, INTERVAL 30 DAY);