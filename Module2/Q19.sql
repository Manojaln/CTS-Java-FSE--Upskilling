
select e.title, count(r.registration_id) as registration_count, avg(f.rating) as average_rating
form Events e
Join Registrations r On e.event_id = r.event_id
join Feedback f ON e.event_id = f.event_id
where e.status = 'completed'
group by e.event_id;