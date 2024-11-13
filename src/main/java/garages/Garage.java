package garages;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * Représente un garage où les voitures peuvent être stationnées.
 */
@Getter // Génère les getters pour tous les champs
@ToString // Génère la méthode toString()
@RequiredArgsConstructor // Génère un constructeur avec tous les champs "final" ou annotés avec @NonNull
public class Garage {

	private String name;

	public Garage(String s) {
		name = s;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (null == name) {
			throw new IllegalArgumentException("name is null");
		}

		this.name = name;
	}

	@Override
	public String toString() {
		return "Garage " + name;
	}

}