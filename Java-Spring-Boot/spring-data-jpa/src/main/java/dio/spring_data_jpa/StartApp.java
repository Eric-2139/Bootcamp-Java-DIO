package dio.spring_data_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import dio.spring_data_jpa.model.User;
import dio.spring_data_jpa.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Eric");
        user.setUsername("Barakus");
        user.setPassword("Uramasa2139");

        repository.save(user);

        for (User u : repository.findAll()) {
            System.out.println(u);
        }
    }

}
