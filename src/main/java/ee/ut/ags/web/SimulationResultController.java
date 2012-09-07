package ee.ut.ags.web;

import ee.ut.ags.domain.SimulationResult;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/simulationresults")
@Controller
@RooWebScaffold(path = "simulationresults", formBackingObject = SimulationResult.class)
public class SimulationResultController {
}
