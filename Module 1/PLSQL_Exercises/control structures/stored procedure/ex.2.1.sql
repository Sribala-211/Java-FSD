CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
   FOR rec IN (SELECT account_id, balance 
               FROM accounts 
               WHERE account_type = 'SAVINGS') LOOP
      UPDATE accounts
      SET balance = balance * 1.01
      WHERE account_id = rec.account_id;
   END LOOP;
   COMMIT;
END;