import datetime
current_Date = datetime.datetime.now()
def get_input(prompt_message) :
	user_input = input(prompt_message)
	return user_input

list_items_price = [] 
def create_dict_items():
	list_dict = {}
	list_dict['Items'] = get_input("What did the Customer Buy\n")
	list_dict['Qty'] = int(get_input("How Many Peices\n"))
	list_dict['price'] = int(get_input("How Much per Unit\n"))
	list_dict['subtotal'] = list_dict['Qty'] * list_dict['price']
	list_items_price.append(list_dict)
	return list_dict

user_name = get_input('What Is The Customer Name\n')
control = 'yes'
while(control == 'yes'):
	create_dict_items()
	control = get_input('Add More Items\n')
cashier_name = get_input('What Is The Your Name\n')
discount = int(get_input('How Much Discount will he get\n'))

def printline () :
	print("=================================================================================================")


store =  """SEMICOLON STORES
		MAIN BRANCH	
		LOCATION : 312,HERBERT MARCULAY WAY, SABO YABA,LAGOS.
		TEL : 08104260657
		"""

def displayItemsPrice():
	for index, dicion in enumerate(list_items_price):
		print(" 				", end =' ')
		for element in list_items_price[index]:
			print(list_items_price[index][element] , end = '\t\t')
		print()

def calculateubtotal():
	subtotal = 0;
	for index, dicion in enumerate(list_items_price):
		for element in list_items_price[index]:
			if element == 'subtotal': subtotal += list_items_price[index]['subtotal']
	return subtotal 
	
calculated_subtotal = calculateubtotal()
calculate_discount = (discount * calculated_subtotal) / 100
calculate_vat = (7.5 * calculated_subtotal) / 100
calculate_total = calculated_subtotal + calculate_vat - calculate_discount 

def displayInterface() :
	print(store)
	print(f"\t\tDate {current_Date}")
	print(f"\t\tCasheier Name {cashier_name}")
	print(f"\t\tCustomer Name {user_name}")
	printline()
	printline ()
	print( """ 				Item		qty		Price 		Total(NGN) """)
	displayItemsPrice()
	printline()
	print(f"\t\t\t\t\t\t\t\tSubTotal : {calculated_subtotal}")
	print(f"\t\t\t\t\t\t\t\tDiscount : {calculate_discount}")
	print(f"\t\t\t\t\t\t\t\tVat@7.5% : {calculate_vat}")
	printline()
	printline()
	print(f"\t\t\t\t\t\t\t\tBillTotal : {calculate_total}")
	printline()
	printline()

displayInterface()
print(f"\t\t This is not a receipt Kindly Pay {calculate_total}")
customer_payment  = int(get_input('How Much Did The Customer give Your\n'))
displayInterface()
balnance = customer_payment - calculate_total
print(f"\t\t\t\t\t\t\t\tBillTotal : {calculate_total}")
print(f"\t\t\t\t\t\t\t\tAmount PAID : {customer_payment }")
print(f"\t\t\t\t\t\t\t\tAmount PAID : {balnance }")
printline()
printline()
print(f"\t\t Thank you for your patronage")

