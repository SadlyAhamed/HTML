//40to unlimited abnormal, 30-39 hot, 20-29 normal, 0-19 cold 
let weather=12
if(weather>=40){
    console.log("abnormal weather");
}
else if(weather>=30){
    
    console.log("hot weather");
    
}
else if(weather>=20){
    
    console.log("normal weather");
}
else if(weather>=0){
    
    console.log("cold weather");
}
else{
    console.log("invalid weather");
}