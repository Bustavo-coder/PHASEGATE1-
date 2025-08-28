import unittest
import check_out_store

class TestFunctionGetInput(unittest.TestCase):
	def test_that_get_input_is_working(self):
		check_out_store.get_input("What Is your Name")

class TestFunctionCreatDict(unittest.TestCase):
	def test_that_create_dictionary_create_a_return_correct_result(self):
		value_dict = {"Items" : 'Bag',"Qty" : 2,"price" : 1000,"subtotal" : 2000}
		result = check_out_store.create_dict_items()
		self.assertEqual(result, value_dict) 
