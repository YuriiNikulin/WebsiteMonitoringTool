package app.controller;

import app.dto.UrlDto;
import app.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

/**
 * Created by yurii on 10.09.17.
 */
@Controller
@RequestMapping
public class MainController {

    @Autowired
    private UrlService urlService;

    @RequestMapping(value = "/MonitoringWebsite", method = RequestMethod.GET)
    public String showSite(WebRequest request, Model model) {
        UrlDto urlDto = new UrlDto();
        model.addAttribute("urlDto", urlDto);
        return "MonitoringWebsite";
    }

    @RequestMapping(value = "/MonitoringWebsite", method = RequestMethod.POST)
    public String addUrl(Model model, @ModelAttribute("urlDto") UrlDto urlDto){


        return "redirect:/MonitoringWebsite";
    }
}
