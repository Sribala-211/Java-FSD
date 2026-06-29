CREATE OR REPLACE PROCEDURE TransferFunds(
   source_id IN NUMBER,
   target_id IN NUMBER,
   amount IN NUMBER
) IS
   source_balance NUMBER;
BEGIN
   -- Check source balance
   SELECT balance INTO source_balance 
   FROM accounts 
   WHERE account_id = source_id;

   IF source_balance < amount THEN
      RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account');
   ELSE
      -- Deduct from source
      UPDATE accounts
      SET balance = balance - amount
      WHERE account_id = source_id;

      -- Add to target
      UPDATE accounts
      SET balance = balance + amount
      WHERE account_id = target_id;

      COMMIT;
   END IF;
END;
/
