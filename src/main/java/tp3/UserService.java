package tp3;

import java.util.Optional;

public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    /**
     * Retourne l'utilisateur correspondant à l'id, ou lève une exception si introuvable.
     */
    public User getUserById(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
    }

    /**
     * Enregistre un nouvel utilisateur seulement si son email n’existe pas déjà.
     * Retourne true si la sauvegarde a été effectuée, false sinon.
     */
    public boolean registerUser(User user) {
        boolean exists = repository.findByEmail(user.getEmail()).isPresent();
        if (exists) {
            return false;
        }
        repository.save(user);
        return true;
    }

    /**
     * Supprime un utilisateur par son id, si celui-ci existe.
     * Retourne true si supprimé, false sinon.
     */
    public boolean deleteUser(int id) {
        Optional<User> user = repository.findById(id);
        if (user.isPresent()) {
            repository.delete(id);
            return true;
        }
        return false;
    }
}
