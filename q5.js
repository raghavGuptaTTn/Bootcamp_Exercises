
// part A
var employees = [

	{
		name : "raghav",
		age  : 21,
		salary : 800,
		dob : new Date(2018, 10, 24)
	},
	{
		name: "paras",
		age : 19,
		salary : 200,
		dob : new Date(2018, 7, 24)	
	},
	{
		name: "sujata",
		age : 22,
		salary : 20000,
		dob : new Date(2018, 11, 24)	
	},
	{
		name: "sujata",
		age : 22,
		salary : 15000,
		dob : new Date(2018, 11, 24)	
	},
];


// part B
function salFilter(employee){
	return employee.salary > 5000;
}

var salFiltered = employees.filter(salFilter);


// part C

var group = {};
employees.forEach(function(employee){
	if(!group.hasOwnProperty(employee.age))
		group[employee.age] = [];

	group[employee.age].push(employee);
});


// part D
function filter2(employee){
	if(employee.salary<1000 && employee.age>20 ){
		employee.salary *=5;
		return true;
	}
	return false;
}
var ageFiltered = employees.filter(filter2);

