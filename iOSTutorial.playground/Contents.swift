//: Playground - noun: a place where people can play

/*
  iOS tutorial for iOS one hour video
 */

/*===================Normal Libaray========================*/
import UIKit //UI libaray
import Darwin //C libaray


/*======================Basic types===========================*/
//variable
var str = "Hello, playground"
//const variable
let abc = "kkkkkk"

//type of input 

let numberOfStrps: Int = 450

let maxInt: Int = 921314

let MaxUnsignedInt: UInt64 = UInt64.max

print(MaxUnsignedInt)

let folatPrecision: Float = 1.999999 + 0.0000005
print("Float precision", folatPrecision)
//double can have precision about 15 digits
//float can have precision about 6 digits
let doublePrecision: Double = 1.999999999999999 + 0.000000000000005

let isOver18 = true

let myName = "ze"

var statement = "My name is " + myName

statement = statement + "!"

/*=================================Casting===============================*/
print("I'm an Int now \(Int(folatPrecision))")
print("I'm an double now \(Double(maxInt))")
//print("I'm an bool now \(Bool(maxInt))")

let myAge = "6.25"



/*=======================Array================================*/
var someInts = [Int]()
var someString = [String]()

someInts.append(4)
someString.append("gk")

//short hand

someInts += [6,8]

var newIntArr: [Int] = []

//size
newIntArr.count
someInts.count

//value 
print(someInts[0])

/*============================Collection Set======================================*/
var letters = Set<Character>()
letters.insert("a")

var favs: Set = ["var", "let", "wine"]
//force var facs: Set<String> = ["var","aaa"]
//set in iOS is unique value and delete duplicate


/*==============================Collection Dictionary================================*/

//Dictionary<key,value> is like a hash<key,value>
var nameOfInt = [Int: String]()
nameOfInt[2] = "2"

var nameOfIntStr = [Int: [String]]()
nameOfIntStr[2] = ["2","3"]

print(nameOfIntStr[2]?[1])



/*==========================if Else and Switch Case================================*/
var myNum = 33

if(myNum == 33){
  print(myNum)
}else if(myNum > 33){
  print("Old man!")
}else{
  print("Young man!")
}

switch myNum{
case 33:
  print(myNum)
case 0..<33:
  print("young!")
default:
  print("old")
}



/*==========================Loop================================*/


//for loop
for var i in 0..<10 {
  print(i)
}

var numbers: [Int] = [1,2,3,4,5,6]

for var i in numbers{
  print(i)
}

//while loop
var count: Int = 0

while count < 10 {
  print(count)
  count += 1
}


//repeat
repeat{
  print("not yet")
  count += 1
}
while count < 10

/*==========================Function================================*/

func CheckCount(x: Int) -> Int{
  var count: Int = 0
  
  while count < 10 {
    print(count)
    count += 1
  }
  
  return count + x
}

CheckCount(x: 5)
CheckCount(x:102)



/*==========================Optional================================*/

var myStr: String?
print(myStr)

myStr = "grant"

if let myStrVal = myStr{
  var newStr = myStrVal + "Suffix"
}





/*==========================Classes and Objects================================*/
//class is blueprint can have many instants which is called objects

class FastCar{

  var topSpeed = 155
  
  init(topSpeed: Int){
    self.topSpeed = topSpeed
  }
  
  func getTopSpeed() -> Int{
    return self.topSpeed
  }
}

var myCar = FastCar(topSpeed: 210)
myCar.getTopSpeed()

var ferrari = FastCar(topSpeed: 220)
ferrari.getTopSpeed()


/*==============================Inheritance========================================*/

class Car{
  let numWheels = 4
}

class familyCar: Car{
  let numDoors = 5
}

class bigFamilyCar: familyCar{
  let Doors = 7
  var size = "Large"
}

var myFamCar = familyCar()

myFamCar.numWheels
myFamCar.numDoors











