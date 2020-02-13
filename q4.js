var obj = {
	name : "raghav",
	group : 3,
	competency : "FEEN",
	place : "faridabad"
}

var copy = Object.assign({}, obj);
console.log(obj);
console.log(copy);

obj["name"] = "mohit";
console.log(obj);
console.log(copy);
