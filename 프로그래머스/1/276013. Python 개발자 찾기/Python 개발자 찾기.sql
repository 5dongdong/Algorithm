-- 코드를 작성해주세요
select id, email, first_name, last_name
from developer_infos d
where d.skill_1 = 'Python' or d.skill_2 = 'Python' or d.skill_3 = 'Python'
order by id asc