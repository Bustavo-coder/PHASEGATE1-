#Create an empty container to store cars
# Have a fetures That Takes cars From The User If The Space Is empty accpet car if not tell the customer space takes
#Have a Feature That collect userPacking and check if cars is in space if there is car remove car if not tell no car in the current Space 
#Have a feature That Can Show The Customers Available Space In The Container
#Create a Welome Message for the user 
#Create a phase Where the user can interact with the recptionist in my case program

car_space_list = []
for value in range(0,20):
	car_space_list.append(0)

def park_space(input):
	if(type(input) == str):
		raise ValueError('You Can Only Pass Numbers')
	if(input >= len(car_space_list) or input < 0):
		raise ValueError('The Parking Space we Have Left are only 0-19')
	message = 0
	if car_space_list[input] == 0:
		car_space_list[input] = 1
		message = 'Car Added Succesfuly'
	else :
		message = "The Space Has Been Taken"
	return message 

def remove_car(input):
	if(type(input) == str):
		raise ValueError('You Can Only Pass Numbers')
	if(input >= len(car_space_list) or input < 0):
		raise ValueError('The Parking Space we Have Left are only 0-19')
	remove_message = ""
	if car_space_list[input] == 1:
		car_space_list[input] == 0
		remove_message = "Car Removed Succesfuly"
	else : remove_message = 'The Space Is Empty'
	return remove_message


def show_parking_space():
	return car_space_list

def show_welcome_interface():
	welcome_messaage = """
	Welcome To Bustavo Parking Space Wherby Cars Are Trusted With Maximum Security.
	Parking Is Made Easy.
		>>>>>.1 To Park Car
		>>>>>.2 To Remove Car
		>>>>>.3 To Display Parking Space
		>>>>>.0 To Exit
				
			"""
	return welcome_messaage

def main_interface():
	print(show_welcome_interface())
	break_loop = 1
	while(break_loop == 1):
		user_input = int(input('Choose A Menu From The Menus\n'))
		match user_input :
			case 1 :
				user_input_choose_space = int(input('Choose a Parking Space\n'))
				park_message = park_space(user_input_choose_space)
				print(park_message)
				user_input_back_to_menu = int(input('Press 00 to Go Back To Menu\n'))
			case 2 :
				user_input_choose_space = int(input('Choose a Parking Space To Remove Your Car\n'))
				remove_message = remove_car(user_input_choose_space)
				print(remove_message)
				user_input_back_to_menu = int(input('Press 00 to Go Back To Menu\n'))
			case 3 :
				print(show_parking_space())
				user_input_back_to_menu = int(input('Press 00 to Go Back To Menu\n'))
			case 0 : 
				break_loop = 0
			case _ : 
				print("Invalid Menu")
				user_input_back_to_menu = int(input('Press 00 to Go Back To Menu\n'))
		print(show_welcome_interface())
			
main_interface()
	
			