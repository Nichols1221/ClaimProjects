package com.realtor.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.realtor.Entity.Agents;
import com.realtor.Service.AgentService;


@Controller
public class AgentController {

	@Autowired
	AgentService agentService;

	@GetMapping("/agentportal/{agentId}")
	public String agentPortal(Model model, Agents agent, @PathVariable Integer agentId) {
		
		

		if (agentId == null) {
			return "agentSignIn";
		}
		Agents loggedInAgent = agentService.signIn(agent);

		model.addAttribute("agent", loggedInAgent);
		

		return "agentportal";

	}

	@GetMapping("/agentSignUp")
	public String agentSignUp(Model model) {

		model.addAttribute("agent", new Agents());
		return "agentSignUp";

	}

	@PostMapping("/agentSignUp")
	public ModelAndView agentSignUp(@ModelAttribute Agents agent, Model model) {

		agentService.save(agent);

		return new ModelAndView("agentSignIn", "agent", new Agents());

	}

	@GetMapping("/agentSignIn")
	public String agentSignIn(Model model) {

		model.addAttribute("agent", new Agents());

		return "agentSignIn";

	}

	@PostMapping("/agentSignIn")
	public String agentSignIn(@ModelAttribute Agents agent, Model model) {

		Agents loggedInAgent = agentService.signIn(agent);

		if (loggedInAgent == null) {
			return "agentSignIn";
		}

		model.addAttribute("agent", loggedInAgent);
		

		return "agentportal";

	}

	@GetMapping("/profile/{agentId}")
	public String profile(Model model, @PathVariable Integer agentId, HttpSession session) {

		if (agentId == null) {
			return "sign-in";
		}

		Agents loggedInAgent = agentService.getAgentById(agentId);

		if (loggedInAgent == null) {
			return "agentSignIn";
		}

		model.addAttribute("agent", loggedInAgent);

		return "profile";

	}

	@GetMapping("/viewAll")
	public String viewAllAgents(Model model, HttpSession session) {

		return "list";

	}

}
