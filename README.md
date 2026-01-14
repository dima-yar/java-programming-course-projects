# ☕ First Java course Project

---

## 🛠️ Technologies Used for this Project

- **Java**
- **Spring Framework**
- Thymeleaf

---

## ✨ Program Features

### 🏗️ Controller
A controller that has two GET mappings: 
- `Root page`
- `Greetings`


#### 🌱 Root page
Here we can return a string and depict it on our root page. Works only with @RestController! (Because while using a @Controller mapping method returns a template name)
```
@GetMapping(value = "/")
    public String Hello(){
        return "Hello vistula project!";
    }
```

![RootPageAcsess](https://github.com/user-attachments/assets/a21a2276-7700-41c1-90ec-6164b5a5cb1d)

---

#### 👋 Greetings
We can retrieve a value (from the URL, "name" parameter) and return a template that uses this parameter to greet the user.

```
@GetMapping(value="/greeting")
    public String Greeting(@RequestParam(name="name", required=false, defaultValue = "World") String name, Model model){
        model.addAttribute("name", name);
        return "greeting";
    }
```

![Greetings](https://github.com/user-attachments/assets/b7b7e60c-aa8e-4368-b8df-4a0ebb68bce5)

---

## 📚 What I Learned During This Project

- Building a basic Spring controller
- Getting parameters from the URL and using them in templates 

---

## 👤 Author: [Dmytro Yarmoliuk](https://github.com/dima-yar)
