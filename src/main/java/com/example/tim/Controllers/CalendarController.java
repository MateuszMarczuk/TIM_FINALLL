package com.example.tim.Controllers;

import com.example.tim.Model.Group;
import com.example.tim.Repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import java.util.List;
@Controller
public class CalendarController {
	@Autowired
	private GroupRepository groupRepository;

	@GetMapping(value = "/calendar")
	public String showGroupMamagement(Model model) {
		List<Group> groups = groupRepository.findAll();
		model.addAttribute("groups", groups);
		return "calendar";
	}



}
