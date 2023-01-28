Select * from employees;

select * from departments;

select count(*) from employees;

select * from employees e JOIN departments d ON e.department_id = d.department_id;

select * from employees e JOIN departments d ON e.department_id = d.department_id
where d.department_name = 'IT';

select * from employees e JOIN departments d ON e.department_id = d.department_id
where d.department_name = 'IT'
and e.manager_id = d.manager_id
and e.first_name='Bruce';

select count(*) from employees e JOIN departments d ON e.department_id = d.department_id;

select * from employees e
where e.phone_number is null;

-- select all employees and there department names.

select e.first_name, d.department_name from employees e JOIN departments d ON e.department_id = d.department_id;
		
select e.employee_id, e.first_name , d.department_name from employees e LEFT JOIN departments d ON e.department_id = d.department_id;

select e.employee_id, e.department_id, d.department_id from employees e RIGHT JOIN departments d ON e.department_id = d.department_id;

select e.employee_id, e.department_id, d.department_id from employees e RIGHT JOIN departments d ON e.department_id = d.department_id
and e.employee_id is null;

-- select first_name and department name of employees who joined after 2017.
select e.employee_id, e.first_name, d.department_name from employees e LEFT JOIN departments d ON e.department_id = d.department_id where hire_date >= 12-31-2017 ;


-- select all the employees of department Marketing
select e.employee_id, e.first_name, d.department_name from employees e JOIN departments d ON e.department_id = d.department_id where department_name = "Marketing";

-- select all the deparments where there are no employees
select e.employee_id, e.first_name, d.department_id from employees e JOIN departments d ON e.department_id = d.department_id where d.department_id is null;

-- select all the employees which have no department.
select e.employee_id, e.first_name, d.department_id from employees e JOIN departments d ON e.department_id = d.department_id where d.department_id is null;
