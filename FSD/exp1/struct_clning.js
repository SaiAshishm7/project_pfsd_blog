let user = {
    name:"cyrus",
    age:18,
    sizes:{
        width:10,
        height:12
    }
};

user2 = Object.assign({},user);
user3 = structuredClone(user);

console.log(user2.sizes===user.sizes)
console.log(user3.sizes===user.sizes)