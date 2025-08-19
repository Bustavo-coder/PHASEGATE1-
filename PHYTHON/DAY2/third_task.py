def get_amount_likes(names_list):
	if type(names_list) != list:
		raise TypeError
		feed_back = ""
	if len(names_list) == 0 : feed_back = 'No One Like This'
	if len(names_list) == 1 : feed_back = str(names_list[0]) + " Like This "
	if len(names_list) == 2 : feed_back = str(names_list[0]) + ' and ' + str(names_list[1]) + ' Likes This'
	if len(names_list) == 3 : feed_back = str(names_list[0]) + ',' + str(names_list[1]) + ' and ' + str(names_list[1]) + ' Likes This'
	if len(names_list) > 3: feed_back =  str(names_list[0]) + ',' + str(names_list[1]) + ' and ' + str(len(names_list) - 2) + ' Likes This'
	return feed_back
	