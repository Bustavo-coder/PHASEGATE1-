import unittest
import grocrey_store_app

class TestFunctionAddItemToList(unittest.TestCase):
	def setUp(self):
		test_list = []
	def test_that_add_items_exist(self):
		grocrey_store_app.add_items('Rat')

	def test_that_add_items_does_not_take_int_datatype_as_input(self):
		self.assertRaises(ValueError,grocrey_store_app.add_items,1)

	def test_that_add_item_add_with_many_the_list(self):
		first_value = 'Dog'
		result = grocrey_store_app.add_items(first_value)
		self.assertEqual(result , [first_value])

		second_value = 'Cow'
		result = grocrey_store_app.add_items(second_value)
		expected = [first_value,second_value]
		self.assertEqual(result,expected)

class TestFunctionremvoeItemsList(unittest.TestCase):
	def test_list_remove_Cow_from_the_list(self):
		removed = grocrey_store_app.remove_items('Cow')
		self.assertEqual(removed , ['Dog','Rat'])
	def test_list_remove_Dog_from_the_list(self):
		removed =  grocrey_store_app.remove_items('Rat')
		self.assertEqual(removed , ['Dog'])
		
	

		