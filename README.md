# 🏦 Banking Management System

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Active-success?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

**A robust console-based banking application demonstrating Core Java concepts**

[Features](#-features) • [Installation](#️-installation) • [Usage](#-usage) • [Demo](#-demo)

</div>

---

## 📋 Overview

A comprehensive **Banking Management System** built with Core Java that enables complete account management operations. This project showcases professional implementation of OOP principles, Collections Framework, and persistent data storage through file serialization.

## ✨ Features

| Feature | Description |
|---------|-------------|
| 🆕 **Account Creation** | Register new bank accounts with unique account numbers |
| 💰 **Deposit Money** | Add funds to any account with validation |
| 💸 **Withdraw Money** | Secure withdrawal with balance verification |
| 💳 **Balance Inquiry** | Check current account balance instantly |
| 📊 **View All Accounts** | Display comprehensive list of all registered accounts |
| 💾 **Data Persistence** | Automatic data saving using file serialization |
| ⚠️ **Exception Handling** | Robust error handling for invalid transactions |

## 🧠 Core Concepts Demonstrated

<table>
<tr>
<td>

**OOP Principles**
- ✅ Encapsulation
- ✅ Abstraction
- ✅ Data Hiding

</td>
<td>

**Java Features**
- ✅ Collections (HashMap)
- ✅ Exception Handling
- ✅ File I/O & Serialization

</td>
</tr>
</table>

## 🛠️ Technology Stack

```text
Language    : Java (JDK 8+)
IDE Options : IntelliJ IDEA | Eclipse | VS Code
Data Storage: Serialization (.dat files)
```

## ⚙️ Installation

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Any Java IDE or text editor

### Setup Steps

```bash
# 1. Clone the repository
git clone https://github.com/srikanth-thirumani/BankingManagementSystem.git

# 2. Navigate to project directory
cd Banking-Management-System

# 3. Compile the Java file
javac BankingManagementSystem.java

# 4. Run the application
java BankingManagementSystem
```

## 🎯 Usage

### Interactive Menu

```
╔════════════════════════════════════════╗
║   Banking Management System Menu      ║
╠════════════════════════════════════════╣
║  1. Create Account                    ║
║  2. Deposit Money                     ║
║  3. Withdraw Money                    ║
║  4. Check Balance                     ║
║  5. Display All Accounts              ║
║  6. Exit                              ║
╚════════════════════════════════════════╝
```

### Example Workflow

1. **Create Account** → Enter account details
2. **Deposit** → Add initial funds
3. **Check Balance** → Verify transaction
4. **Withdraw** → Make withdrawal as needed

## 📸 Demo

```console
--- Banking Management System ---
1. Create Account
2. Deposit
3. Withdraw
4. Check Balance
5. Display All Accounts
6. Exit

Enter your choice: 1

Enter Account Number: 1001
Enter Name: Thirumani Srikanth
Enter Initial Balance: 5000
✓ Account created successfully!

Enter your choice: 2
Enter Account Number: 1001
Enter deposit amount: 2000
✓ Successfully deposited ₹2000.00
Current Balance: ₹7000.00
```

## 📂 Project Structure

```
Banking-Management-System/
│
├── 📄 BankingManagementSystem.java    # Main application file
├── 📄 BankAccount.java                # Account model class
├── 💾 accounts.dat                    # Serialized data storage
├── 📖 README.md                       # Documentation
└── 📜 LICENSE                         # MIT License
```

## 🔒 Security Features

- ✅ Input validation for all transactions
- ✅ Balance verification before withdrawal
- ✅ Exception handling for edge cases
- ✅ Secure data persistence

## 🚀 Future Enhancements

- [ ] GUI implementation using JavaFX/Swing
- [ ] Database integration (MySQL/PostgreSQL)
- [ ] Transaction history tracking
- [ ] Interest calculation feature
- [ ] Multi-user authentication
- [ ] Account types (Savings, Current, etc.)

## 🤝 Contributing

Contributions are welcome! Feel free to:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 👨‍💻 Author

**Thirumani Srikanth**

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/your-profile)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/your-username)
[![Email](https://img.shields.io/badge/Email-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:your.email@example.com)

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## ⭐ Show Your Support

If you found this project helpful, please give it a ⭐️!

---

<div align="center">

**Made with ❤️ and ☕ by Thirumani Srikanth**

</div>
