package com.doku.wallet.solid.dependency.solid;

import java.util.List;

/**
 * @author robihidayat
 */
public class Project {

    private List<Developer> developers;

    public Project(List<Developer> developers) {
        this.developers = developers;
    }

    public void implement() {
        developers.forEach(d->d.develop());
    }
}
