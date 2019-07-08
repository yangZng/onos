package org.onosproject.cli;

import org.apache.karaf.shell.api.action.Argument;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Service;

@Service
@Command(scope = "onos", name = "cfg2",
        description = "Manages component configuration")
public class TestCommand extends AbstractShellCommand{

    @Argument(index = 0, name = "nodeId", description = "Node ID",
            required = false, multiValued = false)
    String nodeId = null;


    @Override
    protected void doExecute() {
        System.out.println(1);
        System.out.println(2);
    }

}
