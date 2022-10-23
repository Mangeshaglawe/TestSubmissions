 

function saveData()
{
let name,psw;
name=document.getElementById("u_name").value;

psw=document.getElementById("u_pswd").value;

let user_records=new Array();
user_records=JSON.parse(localStorage.getItem("users"))?JSON.parse(localStorage.getItem("users")):[]

if(user_records.some((v)=>{return v.u_name==name}))
{
  alert("duplicate data");
}
else
{
  user_records.push({
  "u_name": name,
//   "email":email,
  "u_pswd":psw
})
localStorage.setItem("users",JSON.stringify(user_records));
}

}