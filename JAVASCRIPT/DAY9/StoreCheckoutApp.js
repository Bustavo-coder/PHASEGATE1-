const prompt = require('prompt-sync')()
priceList = []
const createObject = () =>{
		const eachItem = {}
		eachItem['Item'] =  prompt('What did the user Buy  ')
		eachItem['quatity'] = Number(prompt('How Many Pieces  '))
		eachItem['price'] = Number(prompt('How Much per units  '))
		eachItem['subtotal'] = eachItem['quatity']  * eachItem['price']; 
		priceList.push(eachItem)
	return eachItem 
	}
const calSubtotalnArray = () =>{
	priceTotal = 0 ;
	for(let count = 0; count < priceList.length; count++){
			for (element in priceList[count]){
				if(element == 'subtotal') priceTotal+= priceList[count][element]
				}
		
		}

		return priceTotal;
}


customerName = prompt('What Is Your the Customers Name ')
	centinel = "yes"
	while(centinel == "yes"){
		createObject();
		centinel = prompt("Add More Items ")
		} 
cashierNmae = prompt('What Is Your Name ')
discount = Number(prompt('How Much Discount will he get '))


const printline = () => {return "================================================================================================="}


const store = `
		SEMICOLON STORES
		MAIN BRANCH	
		LOCATION : 312,HERBERT MARCULAY WAY, SABO YABA,LAGOS.
		TEL : 08104260657
		DATE : ${Date()}
		Casheir Name : cashierNmae
		Customers name : customerName
${printline()}
${printline()}
				Item		qty		Price 		Total(NGN)
					
${printline()}`

function displayArray(){
	for(let count = 0; count < priceList.length; count++){
			display = ""
			for (element in priceList[count]){
				display = `\t${display} ${priceList[count][element]}\t\t`
				}
			console.log(display)
		}

	}


function dispalyInvoiceHeader(){
console.log(store)
displayArray()
console.log(printline())
storetotalSubTotal = calSubtotalnArray()
calDiscount = (storetotalSubTotal * discount)/100
calVat = (storetotalSubTotal * 7.5)/100
const bilTotal = storetotalSubTotal + calVat - calDiscount
console.log(printline())
console.log(`\t\t\t\t\t\t\t\tSubTotal: ${storetotalSubTotal}`)
console.log()
console.log(`\t\t\t\t\t\t\t\tDiscount: ${calDiscount}`)
console.log()
console.log(`\t\t\t\t\t\t\t\tVat@ 7.5%: ${calVat}`)
console.log(printline())
console.log()
console.log(`\t\t\t\t\t\t\t\tBilTotal: ${bilTotal}`)
console.log(printline())
console.log(printline())
return bilTotal;
}
storeUserBill = dispalyInvoiceHeader()
console.log("\t\t\t\t\tThis is not an Invoice Kindly Pay")
userPayment = Number(prompt("How Much did the customer give you   "))
dispalyInvoiceHeader()
calUserBalanace = userPayment - storeUserBill 
console.log(`\t\t\t\t\t\t\tAmount Paid : ${userPayment}`)
console.log(`\t\t\t\t\t\t\t\t\tBalanace: ${calUserBalanace}`)
console.log(printline()) 
console.log(printline())
console.log("\t\t\t\t\tThank You For Your Patronage")


