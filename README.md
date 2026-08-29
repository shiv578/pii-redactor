PII Redaction Tool is a lightweight Python utility built to clean sensitive personal information from Microsoft Word (.docx) files, covering both standard paragraphs and embedded tables. Instead of relying on heavy NLP models with binary dependencies that often break across different environments, it uses an optimized regex pipeline combined with Faker to substitute sensitive data—like emails, phone numbers, dates, SSNs, credit cards, and IP addresses—with realistic fake data. It also features a deterministic runtime cache to ensure recurring entities are consistently replaced with the exact same synthetic values across the entire document. To run it, simply place your target file named Assignment\_Document.docx in the working directory and execute python pii\_redactor.py to generate the sanitized Redacted\_Document.docx.







