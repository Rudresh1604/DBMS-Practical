// Create Employee collection and insert documents
db.createCollection('Employee');
db.Employee.insertMany([
  { 'Name': 'Piyush', 'Dept': 'Accounts', 'sal': 50000 },
  { 'Name': 'Pradeep', 'Dept': 'Finance', 'sal': 45000 },
  { 'Name': 'Abhi', 'Dept': 'HR', 'sal': 80000 },
  { 'Name': 'Ashley', 'Dept': 'HR', 'sal': 85000 },
  { 'Name': 'Vipul', 'Dept': 'Finance', 'sal': 25000 },
  { 'Name': 'Pooja', 'Dept': 'Finance', 'sal': 95000 },
  { 'Name': 'Pawan', 'Dept': 'HR', 'sal': 65000 },
  { 'Name': 'Jitu', 'Dept': 'HR', 'sal': 70000 }
]);

// Find employees with salary greater than 50000
db.Employee.find({ "sal": { $gt: 50000 } }).pretty();

// Find employees with salary between 50000 and 80000
db.Employee.find({ "sal": { $gt: 50000, $lt: 80000 } }).pretty();

// Find employees in HR with salary greater than 60000
db.Employee.find({ $and: [{ "sal": { $gt: 60000 } }, { "Dept": "HR" }] }).pretty();

// Update salary and add increment for HR department
db.Employee.updateMany(
    { 'Dept': 'HR' },
    { $set: { sal: '50000', increment: '10%' } }
);

// Display all Employee documents
db.Employee.find().pretty();

// Delete one employee document with 'sal' less than 10000 in 'Finance' department
db.Employee.deleteOne({ $and: [{ "sal": { $lt: 10000 } }, { "Dept": "Finance" }] });
// Create Employee collection and insert documents
db.createCollection('Employee');
db.Employee.insertMany([
  { 'Name': 'Piyush', 'Dept': 'Accounts', 'sal': 50000 },
  { 'Name': 'Pradeep', 'Dept': 'Finance', 'sal': 45000 },
  { 'Name': 'Abhi', 'Dept': 'HR', 'sal': 80000 },
  { 'Name': 'Ashley', 'Dept': 'HR', 'sal': 85000 },
  { 'Name': 'Vipul', 'Dept': 'Finance', 'sal': 25000 },
  { 'Name': 'Pooja', 'Dept': 'Finance', 'sal': 95000 },
  { 'Name': 'Pawan', 'Dept': 'HR', 'sal': 65000 },
  { 'Name': 'Jitu', 'Dept': 'HR', 'sal': 70000 }
]);

// Find employees with salary greater than 50000
db.Employee.find({ "sal": { $gt: 50000 } }).pretty();

// Find employees with salary between 50000 and 80000
db.Employee.find({ "sal": { $gt: 50000, $lt: 80000 } }).pretty();

// Find employees in HR with salary greater than 60000
db.Employee.find({ $and: [{ "sal": { $gt: 60000 } }, { "Dept": "HR" }] }).pretty();

// Update salary and add increment for HR department
db.Employee.updateMany(
    { 'Dept': 'HR' },
    { $set: { sal: '50000', increment: '10%' } }
);

// Display all Employee documents
db.Employee.find().pretty();

// Delete one employee document with 'sal' less than 10000 in 'Finance' department
db.Employee.deleteOne({ $and: [{ "sal": { $lt: 10000 } }, { "Dept": "Finance" }] });
==