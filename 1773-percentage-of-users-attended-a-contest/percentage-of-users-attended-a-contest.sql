# Write your MySQL query statement below
select contest_id,
 round( (count(distinct user_id)/(select count(*) from users))*100 ,2) as percentage 
 from  register 
 group by contest_id 
 order by (count(distinct user_id)/(select count(*) from users))*100 desc, contest_id;
