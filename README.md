Followed the tutorial in http://websystique.com/springmvc/spring-4-mvc-and-hibernate4-integration-example-using-annotations/


Changed the following code to give the JSON Output.
	/*
	 * This method will list all existing employees.
	 */
//	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	@ResponseBody
	@RequestMapping(value = { "/", "/list" }, headers="Accept=application/json", produces= MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> listEmployees(ModelMap model) {

		List<Employee> employees = service.findAllEmployees();
//		model.addAttribute("employees", employees);
//		return "allemployees";
		return employees;
	}