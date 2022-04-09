package Itinery.Manifest;

import People.Person;

import java.util.ArrayList;

public class Manifest {

        private ArrayList<Person> manifest;

        public Manifest() {this.manifest = new ArrayList<>();
        }

        public void addPersonToManifest(Person person) {
            this.manifest.add(person);
        }

        public Person getPersonFromManifestIndex(int manifestIndex){
            return manifest.get(manifestIndex);
        }

        public int getTotal() {
            return manifest.size();
        }
}
